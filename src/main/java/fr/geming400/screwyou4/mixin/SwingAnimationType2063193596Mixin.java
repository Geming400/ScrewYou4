package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.SwingAnimationType.class)
public class SwingAnimationType2063193596Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/item/SwingAnimationType;", cancellable = true)
    private static void values_1447001428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1447001428L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/item/SwingAnimationType;", cancellable = true)
    private static void valueOf__816478729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-816478729L))
            info.setReturnValue(net.minecraft.world.item.SwingAnimationType.NONE);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId_2101455842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2101455842L))
            info.setReturnValue(-982103156);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_927733125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(927733125L))
            info.setReturnValue("\uC284");
    }


}
