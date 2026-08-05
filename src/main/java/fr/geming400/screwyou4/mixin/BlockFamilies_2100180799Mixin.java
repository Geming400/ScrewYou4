package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.BlockFamilies.class)
public class BlockFamilies_2100180799Mixin {
        @Inject(at = @At("HEAD"), method = "getFamily(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/data/BlockFamily;", cancellable = true)
    private static void getFamily_1884534818(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1884534818L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "familyBuilder(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private static void familyBuilder_363905678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(363905678L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAllFamilies()Ljava/util/stream/Stream;", cancellable = true)
    private static void getAllFamilies_330271038(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(330271038L))
            info.setReturnValue(null);
    }


}
