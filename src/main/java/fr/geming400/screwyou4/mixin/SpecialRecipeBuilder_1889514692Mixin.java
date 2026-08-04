package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.recipes.SpecialRecipeBuilder.class)
public class SpecialRecipeBuilder_1889514692Mixin {
        @Inject(at = @At("HEAD"), method = "save(Lnet/minecraft/data/recipes/RecipeOutput;Ljava/lang/String;)V", cancellable = true)
    private void save__1796402995(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1796402995L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "save(Lnet/minecraft/data/recipes/RecipeOutput;Lnet/minecraft/resources/ResourceKey;)V", cancellable = true)
    private void save_1420456333(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1420456333L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "special(Ljava/util/function/Supplier;)Lnet/minecraft/data/recipes/SpecialRecipeBuilder;", cancellable = true)
    private static void special__1768150684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1768150684L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unlockedBy(Ljava/lang/String;Lnet/minecraft/advancements/triggers/Criterion;)Lnet/minecraft/data/recipes/SpecialRecipeBuilder;", cancellable = true)
    private void unlockedBy_1340180624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1340180624L))
            info.setReturnValue(null);
    }


}
