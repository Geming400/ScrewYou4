package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.SelectableRecipe.class)
public class SelectableRecipe1551667748Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1357787289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1357787289L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_416207773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(416207773L))
            info.setReturnValue("/GyH`t `a!pZ.36}R扁kmS2[幨Av]ET&If6捩-tr픬편FhK&珊MWᦱ[l,M@0ꩾ#dPC芖F4D㲃_萬(GRH");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1589930490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1589930490L))
            info.setReturnValue(429371342);
    }

    @Inject(at = @At("HEAD"), method = "recipe()Ljava/util/Optional;", cancellable = true)
    private void recipe_1797129170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1797129170L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "optionDisplay()Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private void optionDisplay__2006345901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2006345901L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noRecipeCodec()Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private static void noRecipeCodec__1482299176(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1482299176L))
            info.setReturnValue(null);
    }


}
