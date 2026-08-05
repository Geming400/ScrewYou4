package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.ListOperation.Insert.class)
public class Insert_1551014598Mixin {
        @Inject(at = @At("HEAD"), method = "mode()Lnet/minecraft/world/level/storage/loot/functions/ListOperation$Type;", cancellable = true)
    private void mode__180065975(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-180065975L))
            info.setReturnValue(net.minecraft.world.level.storage.loot.functions.ListOperation.Type.APPEND);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1358440440(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1358440440L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_415554622(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(415554622L))
            info.setReturnValue("fHw#h87|3ZAi^I缦ಬJo> ::?G^3䝠Ro3g11bK&Rr0I2h`⌕=?鞣螷");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1589277339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1589277339L))
            info.setReturnValue(1542932342);
    }

    @Inject(at = @At("HEAD"), method = "apply(Ljava/util/List;Ljava/util/List;I)Ljava/util/List;", cancellable = true)
    private void apply_592516798(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(592516798L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "offset()I", cancellable = true)
    private void offset_1589276843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1589276843L))
            info.setReturnValue(1721455832);
    }


}
