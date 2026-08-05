package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.LevelSettings.DifficultySettings.class)
public class DifficultySettings_1051797771Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_143171502(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(143171502L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1822221295(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1822221295L))
            info.setReturnValue(".Vcd]t\"dhJPUWoV|Jm\uFE374St*l<UT\u3D67,ih*u^GJe{DR_Q\u8C5CE\u43ED\u727E;5\"P\u08C1\u4508rRj\u6812jJ'l)\u51BD>B-CL\uA53D#S\u5727\uFC5BW9SO.");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1609149861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1609149861L))
            info.setReturnValue(761735626);
    }

    @Inject(at = @At("HEAD"), method = "locked()Z", cancellable = true)
    private void locked_1213948407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1213948407L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "difficulty()Lnet/minecraft/world/Difficulty;", cancellable = true)
    private void difficulty_1258518887(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1258518887L))
            info.setReturnValue(net.minecraft.world.Difficulty.PEACEFUL);
    }

    @Inject(at = @At("HEAD"), method = "hardcore()Z", cancellable = true)
    private void hardcore_1728352759(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1728352759L))
            info.setReturnValue(false);
    }


}
