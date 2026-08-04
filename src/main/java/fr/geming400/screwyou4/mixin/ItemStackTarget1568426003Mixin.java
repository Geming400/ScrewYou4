package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.LootContext.ItemStackTarget.class)
public class ItemStackTarget1568426003Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/storage/loot/LootContext$ItemStackTarget;", cancellable = true)
    private static void values_607530624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(607530624L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/storage/loot/LootContext$ItemStackTarget;", cancellable = true)
    private static void valueOf_1406475901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1406475901L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_432965532(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(432965532L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "contextParam()Lnet/minecraft/util/context/ContextKey;", cancellable = true)
    private void contextParam_850911822(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(850911822L))
            info.setReturnValue(null);
    }


}
