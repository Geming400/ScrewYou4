package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.recipes.packs.VanillaRecipeProvider.TrimTemplate.class)
public class TrimTemplate_279002034Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__629624235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-629624235L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1049425558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1049425558L))
            info.setReturnValue("ZH;-[ruK,eP\u5A81;R\u5D6BFm<H\u7E2FRf\u23CD)iG'x;^");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_836354124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(836354124L))
            info.setReturnValue(-1147953474);
    }

    @Inject(at = @At("HEAD"), method = "template()Lnet/minecraft/world/item/Item;", cancellable = true)
    private void template_759527805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(759527805L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "recipeId()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void recipeId_706488249(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(706488249L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "patternId()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void patternId_1172350071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1172350071L))
            info.setReturnValue(null);
    }


}
