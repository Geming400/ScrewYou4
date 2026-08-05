package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.recipes.packs.VanillaRecipeProvider.TrimTemplate.class)
public class TrimTemplate_279002034Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1664514292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1664514292L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__856457942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-856457942L))
            info.setReturnValue("]@Af䘧&8⺜*vumDZY7o-/侈Na/HoR;騋k)s4|╋O+h)bW\"?⎦eF9T[檼厲t⑺۲㎑I[Vc xU戇thxpW5bvP/[튁[C%Y^NO'䰇HTM@tBp");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_317264775(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(317264775L))
            info.setReturnValue(1508167813);
    }

    @Inject(at = @At("HEAD"), method = "template()Lnet/minecraft/world/item/Item;", cancellable = true)
    private void template__239933385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-239933385L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "patternId()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void patternId_1087493346(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1087493346L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "recipeId()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void recipeId_1087493346(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1087493346L))
            info.setReturnValue(null);
    }


}
