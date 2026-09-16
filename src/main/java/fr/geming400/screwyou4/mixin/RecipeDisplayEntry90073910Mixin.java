package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.display.RecipeDisplayEntry.class)
public class RecipeDisplayEntry90073910Mixin {
        @Inject(at = @At("HEAD"), method = "group()Ljava/util/OptionalInt;", cancellable = true)
    private void group_652611916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(652611916L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__818552358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-818552358L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_860497435(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(860497435L))
            info.setReturnValue("\u0C01)_A[\uD317|ZC(yX.\u88C1<>\u12ACc\u5EB8/@2Mruh3? \uFD01\u8D98laP-S\u891C$(fZ5St16AjP%sW)\"J\u5D51\u6076J=Jw[Q\u9082uXo%!(W\u36C9\uD349d&SkBe)[@2VX");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_647426001(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(647426001L))
            info.setReturnValue(-1567486263);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/world/item/crafting/display/RecipeDisplayId;", cancellable = true)
    private void id__1948756897(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1948756897L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "display()Lnet/minecraft/world/item/crafting/display/RecipeDisplay;", cancellable = true)
    private void display_1349838835(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1349838835L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "category()Lnet/minecraft/world/item/crafting/RecipeBookCategory;", cancellable = true)
    private void category__455644789(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-455644789L))
            info.setReturnValue(new net.minecraft.world.item.crafting.RecipeBookCategory());
    }

    @Inject(at = @At("HEAD"), method = "canCraft(Lnet/minecraft/world/entity/player/StackedItemContents;)Z", cancellable = true)
    private void canCraft_780774035(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(780774035L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "resultItems(Lnet/minecraft/util/context/ContextMap;)Ljava/util/List;", cancellable = true)
    private void resultItems__1710850606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1710850606L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "craftingRequirements()Ljava/util/Optional;", cancellable = true)
    private void craftingRequirements_925439574(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(925439574L))
            info.setReturnValue(null);
    }


}
