package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.ticks.TickPriority.class)
public class TickPriority1240614095Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/ticks/TickPriority;", cancellable = true)
    private static void values_1203458339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1203458339L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/ticks/TickPriority;", cancellable = true)
    private static void valueOf__1567281504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1567281504L))
            info.setReturnValue(net.minecraft.world.ticks.TickPriority.HIGH);
    }

    @Inject(at = @At("HEAD"), method = "getValue()I", cancellable = true)
    private void getValue_1278876341(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1278876341L))
            info.setReturnValue(-904117969);
    }

    @Inject(at = @At("HEAD"), method = "byValue(I)Lnet/minecraft/world/ticks/TickPriority;", cancellable = true)
    private static void byValue__561980591(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-561980591L))
            info.setReturnValue(net.minecraft.world.ticks.TickPriority.VERY_LOW);
    }


}
