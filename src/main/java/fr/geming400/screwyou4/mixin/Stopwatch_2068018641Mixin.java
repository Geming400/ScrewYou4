package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.Stopwatch.class)
public class Stopwatch_2068018641Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1159392372(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1159392372L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1456525131(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1456525131L))
            info.setReturnValue("]BnW#{]z9?o7@<SV/\uB0FD\u1531YR8qorU>[<\uA2D7ML$\u4022kO\uFB71Ge9R/moz\u3F41\uABED@IF\u974BXp:;b]dQ\u32E6M2f@:oLitE\u433F");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1669596565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1669596565L))
            info.setReturnValue(-649491616);
    }

    @Inject(at = @At("HEAD"), method = "creationTime()J", cancellable = true)
    private void creationTime_1626321067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1626321067L))
            info.setReturnValue(-1343592311279727740L);
    }

    @Inject(at = @At("HEAD"), method = "elapsedSeconds(J)D", cancellable = true)
    private void elapsedSeconds__1654814706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1654814706L))
            info.setReturnValue(1.7181350026408154E8D);
    }

    @Inject(at = @At("HEAD"), method = "accumulatedElapsedTime()J", cancellable = true)
    private void accumulatedElapsedTime_1460393488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1460393488L))
            info.setReturnValue(-8367821995079833279L);
    }

    @Inject(at = @At("HEAD"), method = "elapsedMilliseconds(J)J", cancellable = true)
    private void elapsedMilliseconds_997331615(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(997331615L))
            info.setReturnValue(-7026389652924291795L);
    }


}
