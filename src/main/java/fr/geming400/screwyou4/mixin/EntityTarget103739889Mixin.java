package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.LootContext.EntityTarget.class)
public class EntityTarget103739889Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/storage/loot/LootContext$EntityTarget;", cancellable = true)
    private static void values_1235540460(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1235540460L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/storage/loot/LootContext$EntityTarget;", cancellable = true)
    private static void valueOf_684405519(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(684405519L))
            info.setReturnValue(net.minecraft.world.level.storage.loot.LootContext.EntityTarget.INTERACTING_ENTITY);
    }

    @Inject(at = @At("HEAD"), method = "getByName(Ljava/lang/String;)Lnet/minecraft/world/level/storage/loot/LootContext$EntityTarget;", cancellable = true)
    private static void getByName_684405519(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(684405519L))
            info.setReturnValue(net.minecraft.world.level.storage.loot.LootContext.EntityTarget.INTERACTING_ENTITY);
    }

    @Inject(at = @At("HEAD"), method = "contextParam()Lnet/minecraft/util/context/ContextKey;", cancellable = true)
    private void contextParam__613774292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-613774292L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__1031720582(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1031720582L))
            info.setReturnValue("y㔷w%SUE茗3TU9\"(Xs;?IlOB'L뇦F6");
    }


}
