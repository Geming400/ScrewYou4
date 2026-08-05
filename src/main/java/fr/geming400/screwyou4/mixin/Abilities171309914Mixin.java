package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.player.Abilities.class)
public class Abilities171309914Mixin {
        @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/world/entity/player/Abilities$Packed;)V", cancellable = true)
    private void apply_2081186453(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2081186453L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pack()Lnet/minecraft/world/entity/player/Abilities$Packed;", cancellable = true)
    private void pack__1354420063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1354420063L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWalkingSpeed()F", cancellable = true)
    private void getWalkingSpeed_209569277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(209569277L))
            info.setReturnValue(1.353743E8F);
    }

    @Inject(at = @At("HEAD"), method = "getFlyingSpeed()F", cancellable = true)
    private void getFlyingSpeed_209569277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(209569277L))
            info.setReturnValue(1.353743E8F);
    }

    @Inject(at = @At("HEAD"), method = "setWalkingSpeed(F)V", cancellable = true)
    private void setWalkingSpeed_1382456323(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1382456323L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setFlyingSpeed(F)V", cancellable = true)
    private void setFlyingSpeed_1382456323(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1382456323L))
            info.cancel();
    }


}
