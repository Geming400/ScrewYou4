package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.EntityAttachments.Builder.class)
public class Builder_1415648610Mixin {
        @Inject(at = @At("HEAD"), method = "build(FF)Lnet/minecraft/world/entity/EntityAttachments;", cancellable = true)
    private void build_46331595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(46331595L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attach(Lnet/minecraft/world/entity/EntityAttachment;Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/entity/EntityAttachments$Builder;", cancellable = true)
    private void attach__1231280427(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1231280427L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attach(Lnet/minecraft/world/entity/EntityAttachment;FFF)Lnet/minecraft/world/entity/EntityAttachments$Builder;", cancellable = true)
    private void attach__680133013(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-680133013L))
            info.setReturnValue(null);
    }


}
