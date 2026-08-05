package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.variant.VariantUtils.class)
public class VariantUtils1424382346Mixin {
        @Inject(at = @At("HEAD"), method = "getAny(Lnet/minecraft/core/RegistryAccess;Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/core/Holder;", cancellable = true)
    private static void getAny_1902849064(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1902849064L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeVariant(Lnet/minecraft/world/level/storage/ValueOutput;Lnet/minecraft/core/Holder;)V", cancellable = true)
    private static void writeVariant__1608126865(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1608126865L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "selectVariantToSpawn(Lnet/minecraft/world/entity/variant/SpawnContext;Lnet/minecraft/resources/ResourceKey;)Ljava/util/Optional;", cancellable = true)
    private static void selectVariantToSpawn__1597742838(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1597742838L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultOrAny(Lnet/minecraft/core/RegistryAccess;Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/core/Holder;", cancellable = true)
    private static void getDefaultOrAny_1902849064(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1902849064L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readVariant(Lnet/minecraft/world/level/storage/ValueInput;Lnet/minecraft/resources/ResourceKey;)Ljava/util/Optional;", cancellable = true)
    private static void readVariant_375600274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(375600274L))
            info.setReturnValue(null);
    }


}
