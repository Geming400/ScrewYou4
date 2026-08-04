package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.LevelSettings.DifficultySettings.class)
public class DifficultySettings_1051797771Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1857657267(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1857657267L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__83662205(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-83662205L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1090060512(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1090060512L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hardcore()Z", cancellable = true)
    private void hardcore_1090076353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1090076353L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "difficulty()Lnet/minecraft/world/Difficulty;", cancellable = true)
    private void difficulty__19954900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-19954900L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "locked()Z", cancellable = true)
    private void locked_1090076353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1090076353L))
            info.setReturnValue(null);
    }


}
