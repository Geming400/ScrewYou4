package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.scores.ScoreboardSaveData.Packed.class)
public class Packed421532523Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__487093745(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-487093745L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1191956048(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1191956048L))
            info.setReturnValue("%P_\u02E6x/&\u0D8D|gQ kpB1\"9eR\u6E39*\u44A5J\u06B3lpY hi[TE\"X\u095B_Mp7\u5D79R-7OR|SA*OV+5\u5B73^i\u07387yb?\uFA6A8Z9{\u2E85w\"\u32F3+=");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_978884614(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(978884614L))
            info.setReturnValue(1131168513);
    }

    @Inject(at = @At("HEAD"), method = "displaySlots()Ljava/util/Map;", cancellable = true)
    private void displaySlots_1921504480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1921504480L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "scores()Ljava/util/List;", cancellable = true)
    private void scores_2006596412(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2006596412L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "objectives()Ljava/util/List;", cancellable = true)
    private void objectives__789332235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-789332235L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "teams()Ljava/util/List;", cancellable = true)
    private void teams__654175151(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-654175151L))
            info.setReturnValue(null);
    }


}
