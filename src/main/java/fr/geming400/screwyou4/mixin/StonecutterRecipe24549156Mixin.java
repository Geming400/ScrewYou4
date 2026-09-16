package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.StonecutterRecipe.class)
public class StonecutterRecipe24549156Mixin {
        @Inject(at = @At("HEAD"), method = "group()Ljava/lang/String;", cancellable = true)
    private void group__1819782164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1819782164L))
            info.setReturnValue("K\u5C640j&`4_&wwy\u04C3(wz\u8FD1&0N\u60FCWdBo5xTtZ;u[X;mtm\u6324\u2F5C.HRkQY*RN@AaOlVOR*Q_Q94tpRF\u16E8X*C\u2C06dT\u6A82F1mJrF]");
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/item/crafting/RecipeType;", cancellable = true)
    private void getType_46724504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(46724504L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "display()Ljava/util/List;", cancellable = true)
    private void display_1685694742(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1685694742L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resultDisplay()Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private void resultDisplay__1320850610(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1320850610L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "recipeBookCategory()Lnet/minecraft/world/item/crafting/RecipeBookCategory;", cancellable = true)
    private void recipeBookCategory__448012944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-448012944L))
            info.setReturnValue(new net.minecraft.world.item.crafting.RecipeBookCategory());
    }

    @Inject(at = @At("HEAD"), method = "getSerializer()Lnet/minecraft/world/item/crafting/RecipeSerializer;", cancellable = true)
    private void getSerializer_589435480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(589435480L))
            info.setReturnValue(null);
    }


}
