package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.variant.SpawnContext.class)
public class SpawnContext_305183198Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__603443071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-603443071L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1075606722(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1075606722L))
            info.setReturnValue("+Up`kIx :.>PQH=\uD41Ftv|\u3315@\u6E18cqUJ*bm2^M\uC4BA\u41F5B\u759DDq=CB\uB9FF 2, \uA3C7^HI|sQz\uC093LW m6?\uA7FEK\u2BD63MU'jH[L?\u6CAE0e.a +7_Q\u957F;");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_862535288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(862535288L))
            info.setReturnValue(-772904153);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/entity/variant/SpawnContext;", cancellable = true)
    private static void create_1029463821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1029463821L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void pos__1975593078(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1975593078L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "level()Lnet/minecraft/world/level/ServerLevelAccessor;", cancellable = true)
    private void level_1432191505(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1432191505L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "environmentAttributes()Lnet/minecraft/world/attribute/EnvironmentAttributeReader;", cancellable = true)
    private void environmentAttributes_667107141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(667107141L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "biome()Lnet/minecraft/core/Holder;", cancellable = true)
    private void biome__297323207(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-297323207L))
            info.setReturnValue(null);
    }


}
