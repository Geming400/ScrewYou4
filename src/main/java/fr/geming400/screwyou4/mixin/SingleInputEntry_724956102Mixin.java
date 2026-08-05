package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.SelectableRecipe.SingleInputEntry.class)
public class SingleInputEntry_724956102Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2110468360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2110468360L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__410503874(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-410503874L))
            info.setReturnValue("^㑏P GE㢿qv ezif鲈9.\"쁮> p@⟼⫕Mjw趾1{Wx礪/qy幘=N1iHo`Ŗ98Z⯴6]{vx\"%LMc6h\"jw/fVu-'$z啄j$Rc%jHcz齈Nia夀L貼wnamnB");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_763218843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(763218843L))
            info.setReturnValue(-511222049);
    }

    @Inject(at = @At("HEAD"), method = "input()Lnet/minecraft/world/item/crafting/Ingredient;", cancellable = true)
    private void input_227516928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(227516928L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "recipe()Lnet/minecraft/world/item/crafting/SelectableRecipe;", cancellable = true)
    private void recipe__1747473619(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1747473619L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noRecipeCodec()Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private static void noRecipeCodec_1985956473(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1985956473L))
            info.setReturnValue(null);
    }


}
