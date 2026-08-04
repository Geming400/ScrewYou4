package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.EntityAttachments.Builder.class)
public class Builder_1415648610Mixin {
        @Inject(at = @At("HEAD"), method = "build(FF)Lnet/minecraft/world/entity/EntityAttachments;", cancellable = true)
    private void build__265950371(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-265950371L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attach(Lnet/minecraft/world/entity/EntityAttachment;Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/entity/EntityAttachments$Builder;", cancellable = true)
    private void attach__2046357424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2046357424L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attach(Lnet/minecraft/world/entity/EntityAttachment;FFF)Lnet/minecraft/world/entity/EntityAttachments$Builder;", cancellable = true)
    private void attach__222273946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-222273946L))
            info.setReturnValue(null);
    }


}
