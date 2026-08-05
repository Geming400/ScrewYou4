package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.Stopwatches.class)
public class Stopwatches_485212275Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/resources/Identifier;)Z", cancellable = true)
    private void remove__1009225039(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1009225039L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/world/Stopwatch;", cancellable = true)
    private void get__1400461950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1400461950L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/resources/Identifier;Ljava/util/function/UnaryOperator;)Z", cancellable = true)
    private void update_907403012(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(907403012L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/resources/Identifier;Lnet/minecraft/world/Stopwatch;)Z", cancellable = true)
    private void add__891170948(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-891170948L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "currentTime()J", cancellable = true)
    private static void currentTime_523475729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(523475729L))
            info.setReturnValue(3091594930141704511L);
    }

    @Inject(at = @At("HEAD"), method = "isDirty()Z", cancellable = true)
    private void isDirty_523490857(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(523490857L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "ids()Ljava/util/List;", cancellable = true)
    private void ids_2111549090(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2111549090L))
            info.setReturnValue(null);
    }


}
