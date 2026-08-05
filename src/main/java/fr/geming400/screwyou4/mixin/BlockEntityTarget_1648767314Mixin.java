package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.LootContext.BlockEntityTarget.class)
public class BlockEntityTarget_1648767314Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/storage/loot/LootContext$BlockEntityTarget;", cancellable = true)
    private static void values_1623606177(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1623606177L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/storage/loot/LootContext$BlockEntityTarget;", cancellable = true)
    private static void valueOf_3200488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(3200488L))
            info.setReturnValue(net.minecraft.world.level.storage.loot.LootContext.BlockEntityTarget.BLOCK_ENTITY);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1736975935(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1736975935L))
            info.setReturnValue("|9\u4D7Er^E_\uCED6re4+]0A&HYj\u8E7Bg2\u7B1F6'L\u34A03\u6977*jRn]A%k`Po8vx^`+KJE1o;bi`eK.a\u114F?=P\u745E\u7333");
    }

    @Inject(at = @At("HEAD"), method = "contextParam()Lnet/minecraft/util/context/ContextKey;", cancellable = true)
    private void contextParam_1905654958(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1905654958L))
            info.setReturnValue(null);
    }


}
