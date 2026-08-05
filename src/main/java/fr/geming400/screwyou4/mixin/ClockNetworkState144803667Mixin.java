package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.clock.ClockNetworkState.class)
public class ClockNetworkState144803667Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1530315926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1530315926L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__990656308(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-990656308L))
            info.setReturnValue("\u02F1j\uA22Ab\"6J7\" #w\u646BNFh_eM\u4B4DUYZBQ\u9C6CtiI>MkL+\u7305\u16F7'#_\u7E1C\u33C8");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_183066409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(183066409L))
            info.setReturnValue(1618129094);
    }

    @Inject(at = @At("HEAD"), method = "partialTick()F", cancellable = true)
    private void partialTick_183063030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(183063030L))
            info.setReturnValue(3.894485E8F);
    }

    @Inject(at = @At("HEAD"), method = "rate()F", cancellable = true)
    private void rate_183063030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(183063030L))
            info.setReturnValue(3.909597E8F);
    }

    @Inject(at = @At("HEAD"), method = "totalTicks()J", cancellable = true)
    private void totalTicks_183066874(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(183066874L))
            info.setReturnValue(2286212847644899496L);
    }


}
