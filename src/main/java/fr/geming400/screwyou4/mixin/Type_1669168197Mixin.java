package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.ListOperation.Type.class)
public class Type_1669168197Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/storage/loot/functions/ListOperation$Type;", cancellable = true)
    private static void values_1469674279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1469674279L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/storage/loot/functions/ListOperation$Type;", cancellable = true)
    private static void valueOf_467174090(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(467174090L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_533707725(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(533707725L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mapCodec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void mapCodec__889945376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-889945376L))
            info.setReturnValue(null);
    }


}
