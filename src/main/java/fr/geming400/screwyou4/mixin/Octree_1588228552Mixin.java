package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.Octree.class)
public class Octree_1588228552Mixin {
        @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/client/renderer/chunk/SectionRenderDispatcher$RenderSection;)Z", cancellable = true)
    private void add__897875641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-897875641L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "visitNodes(Lnet/minecraft/client/renderer/Octree$OctreeVisitor;Lnet/minecraft/client/renderer/culling/Frustum;I)V", cancellable = true)
    private void visitNodes_1358105446(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1358105446L))
            info.cancel();
    }


}
