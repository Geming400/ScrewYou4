package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.CraftingInput.Positioned.class)
public class Positioned_2073678772Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__835776266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-835776266L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_938218796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(938218796L))
            info.setReturnValue("3❽(Z뇡5鬦.{e漎Nc,쑰3{㸩E(I`])揨");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2111941513(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2111941513L))
            info.setReturnValue(-1790782475);
    }

    @Inject(at = @At("HEAD"), method = "input()Lnet/minecraft/world/item/crafting/CraftingInput;", cancellable = true)
    private void input__141928207(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-141928207L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "top()I", cancellable = true)
    private void top_2111941017(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2111941017L))
            info.setReturnValue(-1587635056);
    }

    @Inject(at = @At("HEAD"), method = "left()I", cancellable = true)
    private void left_2111941017(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2111941017L))
            info.setReturnValue(-1586806156);
    }


}
