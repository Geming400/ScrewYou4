package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.LootContext.EntityTarget.class)
public class EntityTarget103739889Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/storage/loot/LootContext$EntityTarget;", cancellable = true)
    private static void values__377059954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-377059954L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/storage/loot/LootContext$EntityTarget;", cancellable = true)
    private static void valueOf_1388143335(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1388143335L))
            info.setReturnValue(net.minecraft.world.level.storage.loot.LootContext.EntityTarget.THIS);
    }

    @Inject(at = @At("HEAD"), method = "getByName(Ljava/lang/String;)Lnet/minecraft/world/level/storage/loot/LootContext$EntityTarget;", cancellable = true)
    private static void getByName__323972713(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-323972713L))
            info.setReturnValue(net.minecraft.world.level.storage.loot.LootContext.EntityTarget.DIRECT_ATTACKER);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_191948511(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(191948511L))
            info.setReturnValue("7\uFE56r@iMOU\uC971e&=ignfZ\u2BD0\u75C2yH3\u07A5e&lY\u8A9Efn\u4E6ARif)H\u1379 =pL{z\u3443SLpfoF\"8-[X\u6353\uC8EEC");
    }

    @Inject(at = @At("HEAD"), method = "contextParam()Lnet/minecraft/util/context/ContextKey;", cancellable = true)
    private void contextParam_360627534(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(360627534L))
            info.setReturnValue(null);
    }


}
