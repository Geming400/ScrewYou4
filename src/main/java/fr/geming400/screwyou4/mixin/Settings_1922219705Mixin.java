package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.border.WorldBorder.Settings.class)
public class Settings_1922219705Mixin {
        @Inject(at = @At("HEAD"), method = "size()D", cancellable = true)
    private void size_1960477145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1960477145L))
            info.setReturnValue(6.3834300218506604E7D);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__987235333(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-987235333L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_786759729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(786759729L))
            info.setReturnValue("@^?㬮᜶p䩚4,{38F/d*:!%le)");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1960482446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1960482446L))
            info.setReturnValue(1906857626);
    }

    @Inject(at = @At("HEAD"), method = "warningBlocks()I", cancellable = true)
    private void warningBlocks_1960481950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1960481950L))
            info.setReturnValue(2110005045);
    }

    @Inject(at = @At("HEAD"), method = "lerpTime()J", cancellable = true)
    private void lerpTime_1960482911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1960482911L))
            info.setReturnValue(-4901006372714182415L);
    }

    @Inject(at = @At("HEAD"), method = "centerX()D", cancellable = true)
    private void centerX_1960477145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1960477145L))
            info.setReturnValue(6.3834300218506604E7D);
    }

    @Inject(at = @At("HEAD"), method = "centerZ()D", cancellable = true)
    private void centerZ_1960477145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1960477145L))
            info.setReturnValue(6.3834300218506604E7D);
    }

    @Inject(at = @At("HEAD"), method = "damagePerBlock()D", cancellable = true)
    private void damagePerBlock_1960477145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1960477145L))
            info.setReturnValue(6.3834300218506604E7D);
    }

    @Inject(at = @At("HEAD"), method = "safeZone()D", cancellable = true)
    private void safeZone_1960477145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1960477145L))
            info.setReturnValue(6.3834300218506604E7D);
    }

    @Inject(at = @At("HEAD"), method = "lerpTarget()D", cancellable = true)
    private void lerpTarget_1960477145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1960477145L))
            info.setReturnValue(6.3834300218506604E7D);
    }

    @Inject(at = @At("HEAD"), method = "warningTime()I", cancellable = true)
    private void warningTime_1960481950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1960481950L))
            info.setReturnValue(2110005045);
    }


}
