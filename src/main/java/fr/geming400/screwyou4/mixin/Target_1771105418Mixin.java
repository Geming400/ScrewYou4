package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.SetNameFunction.Target.class)
public class Target_1771105418Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/storage/loot/functions/SetNameFunction$Target;", cancellable = true)
    private static void values__2083686255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2083686255L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/storage/loot/functions/SetNameFunction$Target;", cancellable = true)
    private static void valueOf__320471372(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-320471372L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "component()Lnet/minecraft/core/component/DataComponentType;", cancellable = true)
    private void component__1255543016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1255543016L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_635644946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(635644946L))
            info.setReturnValue(null);
    }


}
