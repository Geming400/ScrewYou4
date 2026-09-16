package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.MineshaftStructure.Type.class)
public class Type_56452708Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__1832394195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1832394195L))
            info.setReturnValue("\u67CCRpjb&eAg5_MF\u6768/\u29C4W3hC\u1092=\u5020^)\u1F18\u21A0O8w\"i\u3CDBT$_\u2267$`Fl1BF<N|J\u6CF4C}2\u760C:!\u0822zp\u91E2\u1E50ja%|D\u057D4EG");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/levelgen/structure/structures/MineshaftStructure$Type;", cancellable = true)
    private static void values_1871816034(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1871816034L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/levelgen/structure/structures/MineshaftStructure$Type;", cancellable = true)
    private static void valueOf_1551675579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1551675579L))
            info.setReturnValue(net.minecraft.world.level.levelgen.structure.structures.MineshaftStructure.Type.NORMAL);
    }

    @Inject(at = @At("HEAD"), method = "byId(I)Lnet/minecraft/world/level/levelgen/structure/structures/MineshaftStructure$Type;", cancellable = true)
    private static void byId__466550364(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-466550364L))
            info.setReturnValue(net.minecraft.world.level.levelgen.structure.structures.MineshaftStructure.Type.NORMAL);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_144661329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(144661329L))
            info.setReturnValue("rx>t\uA45A\u766BlBT eEh\uBBCA)NC\uB8AD-25FT\uAF9B\u38052EA=");
    }

    @Inject(at = @At("HEAD"), method = "getPlanksState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getPlanksState__707260837(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-707260837L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFenceState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getFenceState_926137511(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(926137511L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWoodState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getWoodState__1042965761(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1042965761L))
            info.setReturnValue(null);
    }


}
