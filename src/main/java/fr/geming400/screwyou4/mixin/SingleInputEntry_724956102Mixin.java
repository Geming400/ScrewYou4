package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.SelectableRecipe.SingleInputEntry.class)
public class SingleInputEntry_724956102Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__183670167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-183670167L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1495379626(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1495379626L))
            info.setReturnValue("\uCFB3m>1}-\u65E3-1KKI%\uCE56-1R.][@,im(`w^C$\u509Bat\u2229B)4r<0\uB98F'J\uB910\u7C6AVs/a-2\u4F71\u881Fl2UAuP|^&Z\u33615j\uA775\uC65Cw.m\u1F28SD\u4DB9 j.O?^zaHI*7\u76CDr)$z:");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1282308192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1282308192L))
            info.setReturnValue(2005001960);
    }

    @Inject(at = @At("HEAD"), method = "input()Lnet/minecraft/world/item/crafting/Ingredient;", cancellable = true)
    private void input__1850952886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1850952886L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "recipe()Lnet/minecraft/world/item/crafting/SelectableRecipe;", cancellable = true)
    private void recipe__717750597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-717750597L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noRecipeCodec()Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private static void noRecipeCodec_1830466354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1830466354L))
            info.setReturnValue(null);
    }


}
