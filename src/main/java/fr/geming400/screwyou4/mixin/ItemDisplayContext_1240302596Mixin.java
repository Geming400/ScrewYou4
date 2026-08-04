package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.ItemDisplayContext.class)
public class ItemDisplayContext_1240302596Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/item/ItemDisplayContext;", cancellable = true)
    private static void values_1294943579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1294943579L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/item/ItemDisplayContext;", cancellable = true)
    private static void valueOf__968536578(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-968536578L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()B", cancellable = true)
    private void getId_1278558114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1278558114L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_104842124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(104842124L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "firstPerson()Z", cancellable = true)
    private void firstPerson_1278581178(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1278581178L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "leftHand()Z", cancellable = true)
    private void leftHand_1278581178(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1278581178L))
            info.setReturnValue(null);
    }


}
