package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.LegacyStuffWrapper.class)
public class LegacyStuffWrapper2047102830Mixin {
        @Inject(at = @At("HEAD"), method = "getPixels(Lnet/minecraft/server/packs/resources/ResourceManager;Lnet/minecraft/resources/Identifier;)[I", cancellable = true)
    private static void getPixels_89362564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(89362564L))
            info.setReturnValue(null);
    }


}
