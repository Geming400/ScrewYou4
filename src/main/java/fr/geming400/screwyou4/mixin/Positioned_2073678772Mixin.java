package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.CraftingInput.Positioned.class)
public class Positioned_2073678772Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1165052503(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1165052503L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1450865000(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1450865000L))
            info.setReturnValue("k{Ar_5P'n>9z\uCEC4}RJn\uB7D4*m\uC196i\u24CFj^pQ_86x;>d\u460Aa1T");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1663936434(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1663936434L))
            info.setReturnValue(158613898);
    }

    @Inject(at = @At("HEAD"), method = "input()Lnet/minecraft/world/item/crafting/CraftingInput;", cancellable = true)
    private void input_707349351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(707349351L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "top()I", cancellable = true)
    private void top_1054635364(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1054635364L))
            info.setReturnValue(-128221488);
    }

    @Inject(at = @At("HEAD"), method = "left()I", cancellable = true)
    private void left__532351502(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-532351502L))
            info.setReturnValue(-1159613567);
    }


}
