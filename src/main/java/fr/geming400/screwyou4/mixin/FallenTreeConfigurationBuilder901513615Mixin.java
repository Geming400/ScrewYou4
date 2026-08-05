package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.FallenTreeConfiguration.FallenTreeConfigurationBuilder.class)
public class FallenTreeConfigurationBuilder901513615Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/levelgen/feature/configurations/FallenTreeConfiguration;", cancellable = true)
    private void build_1625816177(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1625816177L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stumpDecorators(Ljava/util/List;)Lnet/minecraft/world/level/levelgen/feature/configurations/FallenTreeConfiguration$FallenTreeConfigurationBuilder;", cancellable = true)
    private void stumpDecorators__1749966397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1749966397L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "logDecorators(Ljava/util/List;)Lnet/minecraft/world/level/levelgen/feature/configurations/FallenTreeConfiguration$FallenTreeConfigurationBuilder;", cancellable = true)
    private void logDecorators__1749966397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1749966397L))
            info.setReturnValue(null);
    }


}
