package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.Heightmap.Usage.class)
public class Usage_907207716Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/levelgen/Heightmap$Usage;", cancellable = true)
    private static void values__661350857(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-661350857L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/levelgen/Heightmap$Usage;", cancellable = true)
    private static void valueOf_1216684084(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1216684084L))
            info.setReturnValue(net.minecraft.world.level.levelgen.Heightmap.Usage.CLIENT);
    }


}
