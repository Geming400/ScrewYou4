package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.dimension.DimensionType.MonsterSettings.class)
public class MonsterSettings24075523Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__884550745(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-884550745L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_794499048(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(794499048L))
            info.setReturnValue("ouL|[\u6923&6t]^26\u5BAC_]RM?BNi94F?\u8D91i\uCA00<n&F}51'J/VT3h^hj\u7CD1%pHQZ@@R{\u03AF\uD599EC\uD487=\uC807beK\u2A73+dNY\u67EE<V5MU");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_581427614(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(581427614L))
            info.setReturnValue(846423038);
    }

    @Inject(at = @At("HEAD"), method = "monsterSpawnBlockLightLimit()I", cancellable = true)
    private void monsterSpawnBlockLightLimit__1123469608(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1123469608L))
            info.setReturnValue(1798037532);
    }

    @Inject(at = @At("HEAD"), method = "monsterSpawnLightTest()Lnet/minecraft/util/valueproviders/IntProvider;", cancellable = true)
    private void monsterSpawnLightTest_716668709(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(716668709L))
            info.setReturnValue(null);
    }


}
