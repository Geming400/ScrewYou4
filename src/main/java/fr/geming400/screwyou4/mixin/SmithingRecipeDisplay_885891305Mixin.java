package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.display.SmithingRecipeDisplay.class)
public class SmithingRecipeDisplay_885891305Mixin {
        @Inject(at = @At("HEAD"), method = "base()Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private void base__341186394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-341186394L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/item/crafting/display/RecipeDisplay$Type;", cancellable = true)
    private void type_988819671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(988819671L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__22734964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-22734964L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1656314829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1656314829L))
            info.setReturnValue("[\uFA3AU\u2AD8:Nmc5Z'k<>J8ahJYCsL&y3F+$c6sn#O+G4\uBABFO:.\u849DW4h}( (X0!3\u0743?\u88F3B\"k`L-1\uADCF3T&p@\u0904=sgPn\uFA26'6\u17CB%-");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1443243395(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1443243395L))
            info.setReturnValue(-1586060775);
    }

    @Inject(at = @At("HEAD"), method = "result()Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private void result_1771956186(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1771956186L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "template()Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private void template_119489885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(119489885L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addition()Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private void addition__310977125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-310977125L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "craftingStation()Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private void craftingStation__1512154683(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1512154683L))
            info.setReturnValue(null);
    }


}
