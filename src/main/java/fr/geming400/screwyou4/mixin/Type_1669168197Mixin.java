package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.ListOperation.Type.class)
public class Type_1669168197Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/storage/loot/functions/ListOperation$Type;", cancellable = true)
    private static void values__1852277303(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1852277303L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/storage/loot/functions/ListOperation$Type;", cancellable = true)
    private static void valueOf__1627453790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1627453790L))
            info.setReturnValue(net.minecraft.world.level.storage.loot.functions.ListOperation.Type.INSERT);
    }

    @Inject(at = @At("HEAD"), method = "mapCodec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void mapCodec_925173126(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(925173126L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1757376818(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1757376818L))
            info.setReturnValue("!i49Q{5u\u0F05rqLS\uD0D9tkGg&s,/WSz/\u8A4DWTFKn\u3397\")7C\u2DECUr/\u68A8>G\u457ER\u3B51\uCA43\u9E6F\uB0EACj\u0145\uBB5D_.fF z\u7221\uFE4B");
    }


}
