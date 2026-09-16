package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.variant.VariantUtils.class)
public class VariantUtils1424382346Mixin {
        @Inject(at = @At("HEAD"), method = "writeVariant(Lnet/minecraft/world/level/storage/ValueOutput;Lnet/minecraft/core/Holder;)V", cancellable = true)
    private static void writeVariant__170289655(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-170289655L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "readVariant(Lnet/minecraft/world/level/storage/ValueInput;Lnet/minecraft/resources/ResourceKey;)Ljava/util/Optional;", cancellable = true)
    private static void readVariant__1123180765(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1123180765L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultOrAny(Lnet/minecraft/core/RegistryAccess;Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/core/Holder;", cancellable = true)
    private static void getDefaultOrAny__910151510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-910151510L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "selectVariantToSpawn(Lnet/minecraft/world/entity/variant/SpawnContext;Lnet/minecraft/resources/ResourceKey;)Ljava/util/Optional;", cancellable = true)
    private static void selectVariantToSpawn__285265311(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-285265311L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAny(Lnet/minecraft/core/RegistryAccess;Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/core/Holder;", cancellable = true)
    private static void getAny__1136152398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1136152398L))
            info.setReturnValue(null);
    }


}
