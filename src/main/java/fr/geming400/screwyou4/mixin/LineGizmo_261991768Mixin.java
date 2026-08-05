package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gizmos.LineGizmo.class)
public class LineGizmo_261991768Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1647504026(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1647504026L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__873468208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-873468208L))
            info.setReturnValue("");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_300254509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(300254509L))
            info.setReturnValue(1188689950);
    }

    @Inject(at = @At("HEAD"), method = "end()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void end_1359721296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1359721296L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "start()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void start_1359721296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1359721296L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "color()I", cancellable = true)
    private void color_300254013(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(300254013L))
            info.setReturnValue(1391837370);
    }

    @Inject(at = @At("HEAD"), method = "width()F", cancellable = true)
    private void width_300251130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(300251130L))
            info.setReturnValue(4.596293E8F);
    }

    @Inject(at = @At("HEAD"), method = "emit(Lnet/minecraft/gizmos/GizmoPrimitives;F)V", cancellable = true)
    private void emit_859432277(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(859432277L))
            info.cancel();
    }


}
