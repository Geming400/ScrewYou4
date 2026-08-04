package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.scores.Scoreboard.PackedScore.class)
public class PackedScore1558456498Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1350998539(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1350998539L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_422996523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(422996523L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1596719240(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1596719240L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "owner()Ljava/lang/String;", cancellable = true)
    private void owner_422996027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(422996027L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "score()Lnet/minecraft/world/scores/Score$Packed;", cancellable = true)
    private void score__1539191793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1539191793L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "objective()Ljava/lang/String;", cancellable = true)
    private void objective_422996027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(422996027L))
            info.setReturnValue(null);
    }


}
