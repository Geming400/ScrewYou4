package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.Stopwatches.class)
public class Stopwatches_485212275Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/resources/Identifier;)Z", cancellable = true)
    private void remove_846454445(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(846454445L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/world/Stopwatch;", cancellable = true)
    private void get__511248020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-511248020L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/resources/Identifier;Ljava/util/function/UnaryOperator;)Z", cancellable = true)
    private void update__1640675685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1640675685L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/resources/Identifier;Lnet/minecraft/world/Stopwatch;)Z", cancellable = true)
    private void add_1957138205(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1957138205L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "currentTime()J", cancellable = true)
    private static void currentTime_1607695083(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1607695083L))
            info.setReturnValue(6013904458426556782L);
    }

    @Inject(at = @At("HEAD"), method = "isDirty()Z", cancellable = true)
    private void isDirty__428621215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-428621215L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "ids()Ljava/util/List;", cancellable = true)
    private void ids_556185946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(556185946L))
            info.setReturnValue(null);
    }


}
