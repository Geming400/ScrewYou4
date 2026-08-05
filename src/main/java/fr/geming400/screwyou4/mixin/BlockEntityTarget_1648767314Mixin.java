package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.LootContext.BlockEntityTarget.class)
public class BlockEntityTarget_1648767314Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/storage/loot/LootContext$BlockEntityTarget;", cancellable = true)
    private static void values_1524890115(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1524890115L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/storage/loot/LootContext$BlockEntityTarget;", cancellable = true)
    private static void valueOf_512155328(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(512155328L))
            info.setReturnValue(net.minecraft.world.level.storage.loot.LootContext.BlockEntityTarget.BLOCK_ENTITY);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_513306842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(513306842L))
            info.setReturnValue("\u488Bj}8C,1I]ST\u1B2Fp\uA522Lw\uCCF6{TT5y\u8F3D>A\uC4AE;\u2371%>y2%}di!3u@\u42C2]");
    }

    @Inject(at = @At("HEAD"), method = "contextParam()Lnet/minecraft/util/context/ContextKey;", cancellable = true)
    private void contextParam_931253132(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(931253132L))
            info.setReturnValue(null);
    }


}
