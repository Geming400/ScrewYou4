package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.DataGenerator.PackGenerator.class)
public class PackGenerator_822385903Mixin {
        @Inject(at = @At("HEAD"), method = "addProvider(Lnet/minecraft/data/DataProvider$Factory;)Lnet/minecraft/data/DataProvider;", cancellable = true)
    private void addProvider_272616797(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(272616797L))
            info.setReturnValue(null);
    }


}
