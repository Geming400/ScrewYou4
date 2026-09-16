package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.ItemDisplayContext.class)
public class ItemDisplayContext_1240302596Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/item/ItemDisplayContext;", cancellable = true)
    private static void values__2104650243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2104650243L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/item/ItemDisplayContext;", cancellable = true)
    private static void valueOf_1759238614(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1759238614L))
            info.setReturnValue(net.minecraft.world.item.ItemDisplayContext.FIRST_PERSON_RIGHT_HAND);
    }

    @Inject(at = @At("HEAD"), method = "getId()B", cancellable = true)
    private void getId__418027727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-418027727L))
            info.setReturnValue(36);
    }

    @Inject(at = @At("HEAD"), method = "firstPerson()Z", cancellable = true)
    private void firstPerson__2113137995(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2113137995L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1328511217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1328511217L))
            info.setReturnValue("D/7$5\u1655;r>-}]Qy6\u835BTlu>xV\uC747<uiUsD?D|M9\uA91Dmio\uBB0A\u3594V`\u2C1F}&o\u776B\uBE1A?l7>5\u8767y\u2C6C^)z");
    }

    @Inject(at = @At("HEAD"), method = "leftHand()Z", cancellable = true)
    private void leftHand_1847352932(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1847352932L))
            info.setReturnValue(true);
    }


}
