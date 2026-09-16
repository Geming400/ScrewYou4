package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.UseRemainder.class)
public class UseRemainder_1454331524Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_545705255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(545705255L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2070212248(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2070212248L))
            info.setReturnValue("*YG)\u5943v80c\u0D78M");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2011683614(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2011683614L))
            info.setReturnValue(-482705398);
    }

    @Inject(at = @At("HEAD"), method = "convertIntoRemainder(Lnet/minecraft/world/item/ItemStack;IZLnet/minecraft/world/item/component/UseRemainder$OnExtraCreatedRemainder;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void convertIntoRemainder__274629479(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-274629479L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "convertInto()Lnet/minecraft/world/item/ItemStackTemplate;", cancellable = true)
    private void convertInto_1479220608(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1479220608L))
            info.setReturnValue(null);
    }


}
