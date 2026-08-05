package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.Octree.class)
public class Octree_1588228552Mixin {
        @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/client/renderer/chunk/SectionRenderDispatcher$RenderSection;)Z", cancellable = true)
    private void add_1742402214(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1742402214L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "visitNodes(Lnet/minecraft/client/renderer/Octree$OctreeVisitor;Lnet/minecraft/client/renderer/culling/Frustum;I)V", cancellable = true)
    private void visitNodes__71834420(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-71834420L))
            info.cancel();
    }


}
