package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.MineshaftStructure.Type.class)
public class Type_56452708Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__1079007764(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1079007764L))
            info.setReturnValue("PTaB`\uB241 o/yqBn\u5A09Y2:Gq(V]sa9q8a`iA!row^93!wRU-3+");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/levelgen/structure/structures/MineshaftStructure$Type;", cancellable = true)
    private static void values_786922944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(786922944L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/levelgen/structure/structures/MineshaftStructure$Type;", cancellable = true)
    private static void valueOf_393556195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(393556195L))
            info.setReturnValue(net.minecraft.world.level.levelgen.structure.structures.MineshaftStructure.Type.MESA);
    }

    @Inject(at = @At("HEAD"), method = "byId(I)Lnet/minecraft/world/level/levelgen/structure/structures/MineshaftStructure$Type;", cancellable = true)
    private static void byId_479510354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(479510354L))
            info.setReturnValue(net.minecraft.world.level.levelgen.structure.structures.MineshaftStructure.Type.MESA);
    }

    @Inject(at = @At("HEAD"), method = "getWoodState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getWoodState_2055661137(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2055661137L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFenceState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getFenceState_2055661137(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2055661137L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlanksState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getPlanksState_2055661137(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2055661137L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__1079007764(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1079007764L))
            info.setReturnValue("PTaB`\uB241 o/yqBn\u5A09Y2:Gq(V]sa9q8a`iA!row^93!wRU-3+");
    }


}
