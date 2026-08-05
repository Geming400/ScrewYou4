package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.BlockFamilies.class)
public class BlockFamilies_2100180799Mixin {
        @Inject(at = @At("HEAD"), method = "getFamily(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/data/BlockFamily;", cancellable = true)
    private static void getFamily__538443076(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-538443076L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "familyBuilder(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/data/BlockFamily$Builder;", cancellable = true)
    private static void familyBuilder__1327215739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1327215739L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAllFamilies()Ljava/util/stream/Stream;", cancellable = true)
    private static void getAllFamilies_1889474731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1889474731L))
            info.setReturnValue(null);
    }


}
