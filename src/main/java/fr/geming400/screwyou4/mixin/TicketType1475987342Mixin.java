package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.TicketType.class)
public class TicketType1475987342Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1433467695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1433467695L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_340527367(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(340527367L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "flags()I", cancellable = true)
    private void flags_1514249588(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1514249588L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1514250084(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1514250084L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "timeout()J", cancellable = true)
    private void timeout_1514250549(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1514250549L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "doesSimulate()Z", cancellable = true)
    private void doesSimulate_1514265925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1514265925L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "doesLoad()Z", cancellable = true)
    private void doesLoad_1514265925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1514265925L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasTimeout()Z", cancellable = true)
    private void hasTimeout_1514265925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1514265925L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "persist()Z", cancellable = true)
    private void persist_1514265925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1514265925L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldKeepDimensionActive()Z", cancellable = true)
    private void shouldKeepDimensionActive_1514265925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1514265925L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canExpireIfUnloaded()Z", cancellable = true)
    private void canExpireIfUnloaded_1514265925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1514265925L))
            info.setReturnValue(null);
    }


}
