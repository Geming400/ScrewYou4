package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.ticks.TickPriority.class)
public class TickPriority1240614095Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/ticks/TickPriority;", cancellable = true)
    private static void values__592338111(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-592338111L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/ticks/TickPriority;", cancellable = true)
    private static void valueOf_417110984(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(417110984L))
            info.setReturnValue(net.minecraft.world.ticks.TickPriority.VERY_LOW);
    }

    @Inject(at = @At("HEAD"), method = "getValue()I", cancellable = true)
    private void getValue__1361805350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1361805350L))
            info.setReturnValue(-1627560861);
    }

    @Inject(at = @At("HEAD"), method = "byValue(I)Lnet/minecraft/world/ticks/TickPriority;", cancellable = true)
    private static void byValue__1731669449(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1731669449L))
            info.setReturnValue(net.minecraft.world.ticks.TickPriority.VERY_HIGH);
    }


}
