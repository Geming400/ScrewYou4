package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.SelectableRecipe.SingleInputSet.class)
public class SingleInputSet682399722Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_1126131311(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1126131311L))
            info.setReturnValue(1520969643);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__226226546(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-226226546L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1452823247(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1452823247L))
            info.setReturnValue("9S7\u4E20\u6E41{Eg\u4264E7=\uD0A9`&\u98B0LW&w5{!R,");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1239751813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1239751813L))
            info.setReturnValue(-633722704);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1741516094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1741516094L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "empty()Lnet/minecraft/world/item/crafting/SelectableRecipe$SingleInputSet;", cancellable = true)
    private static void empty_1961403195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1961403195L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entries()Ljava/util/List;", cancellable = true)
    private void entries_979313322(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(979313322L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "acceptsInput(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void acceptsInput__1022613369(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1022613369L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "selectByInput(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/crafting/SelectableRecipe$SingleInputSet;", cancellable = true)
    private void selectByInput_1556355998(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1556355998L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noRecipeCodec()Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private static void noRecipeCodec_1787909975(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1787909975L))
            info.setReturnValue(null);
    }


}
